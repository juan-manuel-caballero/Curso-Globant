package com.egg.biblioteca.servicios;

import com.egg.biblioteca.entidades.Imagen;
import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.repositorios.ImagenRepositorio;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ImagenServicio {
    @Autowired
    private ImagenRepositorio imagenRepositorio;
    
    public Imagen guardar(MultipartFile archivo) throws MiException {
        if (archivo == null || archivo.isEmpty()) {
            throw new MiException("El archivo no puede estar vacío");
        }
        try {
            Imagen imagen = new Imagen();
            imagen.setMime(archivo.getContentType());
            imagen.setNombre(archivo.getOriginalFilename()); // Cambio aquí
            imagen.setContenido(archivo.getBytes());

            return imagenRepositorio.save(imagen);
        } catch (IOException e) {
            throw new MiException("Error al procesar el archivo");
        }
    }

    public Imagen actualizar(MultipartFile archivo, UUID idImagen) throws MiException {
        if (archivo == null || archivo.isEmpty()) {
            throw new MiException("El archivo no puede estar vacío");
        }
        if (idImagen == null) {
            throw new MiException("ID de imagen no puede ser nulo");
        }
        try {
            Optional<Imagen> respuesta = imagenRepositorio.findById(idImagen);
            if (respuesta.isEmpty()) {
                throw new MiException("No se encontró la imagen con el ID especificado");
            }

            Imagen imagen = respuesta.get();
            imagen.setMime(archivo.getContentType());
            imagen.setNombre(archivo.getOriginalFilename()); // Cambio aquí
            imagen.setContenido(archivo.getBytes());

            return imagenRepositorio.save(imagen);
        } catch (IOException e) {
            throw new MiException("Error al procesar el archivo");
        }
    }

    @Transactional(readOnly = true)
	public List<Imagen> listarTodos() {
		return imagenRepositorio.findAll();
	}
    
}