package com.TABD3.TABD3.controller;

import com.TABD3.TABD3.model.Show;
import com.TABD3.TABD3.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "shows")
public class ShowController {

    @Autowired
    private ShowService showService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Show> cadastrar(@RequestBody Show show) {
        return ResponseEntity.status(HttpStatus.CREATED).body(showService.salvar(show));
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Show>> listarPorId(@PathVariable("id") Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(showService.buscaPorIdShow(id));
    }
}