package com.github.gabguedes.boardgames

import androidx.lifecycle.LiveData
import com.github.gabguedes.boardgames.dao.BoardGameDao

class BoardGameRepository (private val boardGameDao : BoardGameDao) {
    val allBoardGames : LiveData<List<BoardGame>> =
        boardGameDao .getAllBoardGames()
    suspend fun insert(boardGame: BoardGame) {
        boardGameDao .insert(boardGame)
    }
    suspend fun update(boardGame: BoardGame) {
        boardGameDao .update(boardGame)
    }
    suspend fun delete(boardGame: BoardGame) {
        boardGameDao .delete(boardGame)
    }
}