package com.el3asas.applycleanarchitectureapp.home.data

import com.el3asas.entities.Note

class InsertNote(private val repository: NotesRepository) {
    suspend operator fun invoke(note: Note) {
        repository.insertNote(note)
    }
}

class GetNotes(private val repository: NotesRepository) {
    suspend operator fun invoke() = repository.getNotes()

}

class DeleteNotes(private val repository: NotesRepository) {
    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}