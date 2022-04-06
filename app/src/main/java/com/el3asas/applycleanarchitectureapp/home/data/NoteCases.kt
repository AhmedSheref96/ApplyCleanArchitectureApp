package com.el3asas.applycleanarchitectureapp.home.data

import com.el3asas.entities.Note
import javax.inject.Inject

class InsertNote @Inject constructor(private val repository: NotesRepository) {
    suspend fun insert(note: Note) {
        repository.insertNote(note)
    }

    suspend fun insert(note: Note, id: Int) {
        repository.insertNote(note, id)
    }
}

class GetNotes @Inject constructor(private val repository: NotesRepository) {
    lateinit var notes: List<Note>
    private suspend fun getNotes() = repository.getNotes()

    suspend fun getASCNotes(): List<Note> {
        if (!this::notes.isInitialized) {
            getNotes()
        }
        return notes.sortedBy { it.id }
    }

    suspend fun getDSCNotes(): List<Note> {
        if (!this::notes.isInitialized) {
            getNotes()
        }
        return notes.sortedBy { -it.id }
    }

}

class DeleteNotes @Inject constructor(private val repository: NotesRepository) {
    suspend fun deleteNotes(note: Note) {
        repository.deleteNote(note)
    }
}