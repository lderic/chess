package com.lderic.chess.server.common.api.piece

import com.lderic.chess.server.common.api.player.Room

interface Board {
    val room: Room

    val currentType: PieceType

    /**
     * @return the next piece type to be played, but not change type
     */
    val nextType: PieceType

    /**
     * change to the next piece type
     */
    fun jumpToNext()

    /**
     * Set the piece to the given position if it is empty
     * @return false if the position is illegal or occupied
     */
    operator fun set(x: Int, y: Int, piece: Piece): Boolean

    /**
     * @return the piece at the given position
     */
    operator fun get(x: Int, y: Int): Piece

    /**
     * Move the piece from the given position to the given position.
     * If the target position is occupied, it will do nothing.
     * @see moveAndReplace
     * @return false if: [fromX], [fromY], [toX], [toY] is illegal
     * or [toX] and [toY] is occupied
     */
    fun move(fromX: Int, fromY: Int, toX: Int, toY: Int): Boolean

    /**
     * Move the piece from the given position to the given position.
     * If the target position is occupied, replace that piece.
     * @return false if: [fromX], [fromY], [toX], [toY] is illegal
     */
    fun moveAndReplace(fromX: Int, fromY: Int, toX: Int, toY: Int): Boolean

    /**
     * Remove one piece on the board.
     * @return the piece at the given position.
     */
    fun remove(x: Int, y: Int): Piece

    /**
     * Replace the piece at the given position with the given piece.
     * @return the piece at the given position.
     */
    fun replace(x: Int, y: Int, piece: Piece): Piece

    companion object {
        val None = object : Board {
            override val room: Room
                get() = throw UnsupportedOperationException()
            override val currentType: PieceType
                get() = throw UnsupportedOperationException()
            override val nextType: PieceType
                get() = throw UnsupportedOperationException()

            override fun jumpToNext() {
                throw UnsupportedOperationException()
            }

            override fun set(x: Int, y: Int, piece: Piece): Boolean {
                throw UnsupportedOperationException()
            }

            override fun get(x: Int, y: Int): Piece {
                throw UnsupportedOperationException()
            }

            override fun move(fromX: Int, fromY: Int, toX: Int, toY: Int): Boolean {
                throw UnsupportedOperationException()
            }

            override fun moveAndReplace(fromX: Int, fromY: Int, toX: Int, toY: Int): Boolean {
                throw UnsupportedOperationException()
            }

            override fun remove(x: Int, y: Int): Piece {
                throw UnsupportedOperationException()
            }

            override fun replace(x: Int, y: Int, piece: Piece): Piece {
                throw UnsupportedOperationException()
            }
        }
    }
}