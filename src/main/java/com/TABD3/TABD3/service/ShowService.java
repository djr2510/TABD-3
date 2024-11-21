package com.TABD3.TABD3.service;

import com.TABD3.TABD3.model.Show;
import com.TABD3.TABD3.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ShowService {

    @Autowired
    private ShowRepository showRepository;

    public Show salvar(Show show) {
        return showRepository.save(show);
    }

    public List<Show> buscaTodos() {
        return showRepository.findAll();
    }

    public List<Show> buscaPorIdShow(String idShow) {
        return showRepository.findByShowId(idShow);
    }
}
