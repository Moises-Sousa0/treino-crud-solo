package com.madrugadamisterio.madrugada.controller;

import com.madrugadamisterio.madrugada.entity.Musica;
import com.madrugadamisterio.madrugada.service.MusicaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/musicas")
public class MusicaController {
    private MusicaService musicaService;

    public MusicaController(MusicaService musicaService) {
        this.musicaService = musicaService;
    }

    @GetMapping
    List<Musica> list(){
        return musicaService.list();
    }


    @PostMapping
    Musica create(Musica musica){
        return musicaService.create(musica);
    }

    @GetMapping
    Optional<Musica> findById(Long id){
        return musicaService.findById(id);
    }

    @PutMapping
    Musica update(Musica musica){
        return musicaService.update(musica);
    }

    @DeleteMapping("{id}")
    void deleteById(@PathVariable("id")Long id){
         musicaService.deleteById(id);
    }

}
