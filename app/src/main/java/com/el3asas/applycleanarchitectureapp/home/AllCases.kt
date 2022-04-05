package com.el3asas.applycleanarchitectureapp.home

import com.el3asas.applycleanarchitectureapp.home.data.DeleteNotes
import com.el3asas.applycleanarchitectureapp.home.data.GetNotes
import com.el3asas.applycleanarchitectureapp.home.data.InsertNote

data class AllCases(
    val insertNote: InsertNote,
    val deleteNotes: DeleteNotes,
    val getNotes: GetNotes
)