package algorithms.search;

import algorithms.mazeGenerators.Position;

import java.util.Objects;

/**
 * will represent an AState of the Maze problem, holds a specific position in the Maze
 */

public class MazeState extends AState{

    Position position;

    //constructor
    public MazeState(Position position) throws Exception{
        if (position == null)
            throw new Exception("have to get parameter not null ");
        this.position = position;
    }

    @Override
    //compare between two MazeStates
    public boolean equals(Object obj){
        boolean ans =this.position.equals(((MazeState)obj).position);
        return ans;
    }

    @Override
    public String toString() {
        return position.toString();
    }

    @Override
    //hashCode function, using for Hash struct (HashSet)
    public int hashCode() {
        return Objects.hash(position.getRowIndex(), position.getColumnIndex());
    }
}
