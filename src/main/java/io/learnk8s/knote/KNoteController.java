package io.learnk8s.knote;

import io.learnk8s.knote.model.Note;
import io.learnk8s.knote.repository.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class KNoteController {

    @Autowired
    private NotesRepository notesRepository;

    @GetMapping(value = "/", produces = "application/json")
    public List<Note> index() {
        return notesRepository.findAll();
    }

}