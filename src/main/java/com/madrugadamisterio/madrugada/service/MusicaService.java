package com.madrugadamisterio.madrugada.service;

import com.madrugadamisterio.madrugada.entity.Musica;
import com.madrugadamisterio.madrugada.repository.MusicaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;


@Service
public class MusicaService {
    private MusicaRepository musicaRepository;

    public MusicaService(MusicaRepository musicaRepository) {
        this.musicaRepository = musicaRepository;
    }

    public Musica create(Musica musica){
        return musicaRepository.save(musica);
    }

    public List<Musica> list(){ //promete devolver uma lista de musicas
        return musicaRepository.findAll(); //pede pro repository a lista e devolve ela
    }

    public Optional<Musica> findById(Long id){
        return musicaRepository.findById(id);
    }

    public Musica update(Musica musica){
        return musicaRepository.save(musica);
    }

    public void deleteById(Long id){
        musicaRepository.deleteById(id);
    }



    //1. Entity (Musica) → é o molde.
    //É só a "forma" de uma música: tem nome, artista, duração, id. Ela não faz nada, só diz "toda música tem esses campos". É como uma ficha em branco.
    //
    //2. Repository (MusicaRepository) → é o estoquista.
    //Ele é o único que mexe no banco de dados. Sabe salvar, buscar, deletar. Você não precisa ensinar ele a fazer isso — o Spring já te deu os métodos prontos (save, findAll, etc).
    //
    //3. Service (MusicaService) → é o gerente.
    //Ele não fala com o banco direto. Ele pede pro estoquista (repository) fazer o trabalho. O Service é onde fica a "organização" da coisa.
}
