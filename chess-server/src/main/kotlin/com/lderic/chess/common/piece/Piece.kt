package com.lderic.chess.common.piece

import com.lderic.chess.common.Board
import com.lderic.chess.common.Pos

interface Piece {
    val pos: Pos
    val board: Board
    var type: PieceType
    val left: Piece?
    val right: Piece?
    val up: Piece?
    val down: Piece?
}
