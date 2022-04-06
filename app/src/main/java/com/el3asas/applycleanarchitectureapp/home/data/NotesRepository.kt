package com.el3asas.applycleanarchitectureapp.home.data

import com.el3asas.entities.Note
import javax.inject.Inject


class NotesRepository @Inject constructor() : NotesDataSource {

    override suspend fun getNotes(): List<Note>? {
        return null
    }

    override suspend fun insertNote(note: Note) {

    }

    override suspend fun deleteNote(note: Note) {

    }

    override suspend fun insertNote(note: Note, id: Int) {

    }

}