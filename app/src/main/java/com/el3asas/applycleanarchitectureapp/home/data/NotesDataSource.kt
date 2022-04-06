package com.el3asas.applycleanarchitectureapp.home.data

import com.el3asas.entities.Note

interface NotesDataSource {
    suspend fun getNotes(): List<Note>?
    suspend fun insertNote(note: Note)
    suspend fun deleteNote(note: Note)
    suspend fun insertNote(note: Note, id: Int)
}