public class MazeSolver {
    public void solveMaze(String [][] maze){
        int row = maze.length;
        int column = maze[0].length;
        int xPos = 0;
        int yPos = 0;
        boolean[][]visitedPositions = new boolean[row][column];

        visitedPositions[xPos][yPos] = true;
        System.out.println("(" + xPos + "," + yPos + ")");
        while(xPos < row - 1 && yPos < column -1 ){
            if (xPos + 1 < row && maze[xPos + 1][yPos].equals(".") && !visitedPositions[xPos + 1][yPos]){
                xPos = xPos + 1;
            }else if (xPos - 1 > 0 && maze[xPos - 1][yPos].equals(".") && !visitedPositions[xPos - 1][yPos]) {
                xPos = xPos - 1;
            }else if (yPos + 1 < column && maze[xPos][yPos+1].equals(".") && !visitedPositions[xPos][yPos+1]) {
                yPos = yPos + 1;
            }else if (yPos - 1 > 0 && maze[xPos][yPos - 1].equals(".") && !visitedPositions[xPos][yPos - 1]) {
                yPos = yPos - 1;
            }
            visitedPositions[xPos][yPos] = true;
            System.out.println("----> (" + xPos + "," + yPos + ")");


        }




    }
}
