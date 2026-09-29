package com.madrugadamisterio.madrugada.controller;

import com.madrugadamisterio.madrugada.entity.Musica;
import com.madrugadamisterio.madrugada.service.MusicaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

}
