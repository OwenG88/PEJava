import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class P11 {

    static int[][] readGrid() {
    //Read in the grid from a file

    int[][] grid = new int[20][20];
    int y = 0;

    //Read the file line by line
    try (BufferedReader br = new BufferedReader(new FileReader("P11.txt"))) {
        String line;
        while ((line = br.readLine()) != null) {
            //Fill in each row of the grid
            String[] row = line.split(" ");

            for (int x = 0; x < 20; x++) {
                grid[y][x] = Integer.parseInt(row[x]);
            }

            y++;
        }
    } catch (IOException e) {
        System.out.println("Error reading file");
    }
    return grid;
    }

    static int checkRows(int[][] grid) {
        //Check the rows of the grid for the largest four number product
        //Return the number found
        int maxProd = 0;
        
        for (int[] row: grid) {
            for (int x = 0; x < row.length - 4; x++) {
                int prod = row[x] * row[x+1] * row[x+2] * row[x+3];
                if (prod > maxProd) maxProd = prod;
            }
        }
        return maxProd;
    }

    static int checkColumns(int[][] grid) {
        //Check the columns of the grid for the largest four number product
        //Return the number found

        int maxProd = 0;

        for (int y = 0; y < grid.length - 4; y++) {
            for (int x = 0; x < grid.length; x++) {
                int prod = grid[y][x] * grid[y+1][x] * grid[y+2][x] * grid[y+3][x];
                if (prod > maxProd) maxProd = prod;
            }
        }

        return maxProd;
    }

    static int checkMajorDiagonals(int[][] grid) {
        //Check the columns of the grid for the largest four number product
        //Return the number found

        int maxProd = 0;

        for (int y = 0; y < grid.length - 4; y++) {
            for (int x = 0; x < grid.length - 4; x++) {
                int prod = grid[y][x] * grid[y+1][x+1] * grid[y+2][x+2] * grid[y+3][x+3];
                if (prod > maxProd) maxProd = prod;
            }
        }

        return maxProd;
    }

    static int checkMinorDiagonals(int[][] grid) {
        //Check the columns of the grid for the largest four number product
        //Return the number found

        int maxProd = 0;

        for (int y = 3; y < grid.length; y++) {
            for (int x = 0; x < grid.length - 4; x++) {
                int prod = grid[y][x] * grid[y-1][x+1] * grid[y-2][x+2] * grid[y-3][x+3];
                if (prod > maxProd) maxProd = prod;
            }
        }

        return maxProd;
    }

    public static void main(String args[]) {
        int[][] grid = readGrid();

        int maxRowProd = checkRows(grid);
        int maxColumnProd = checkColumns(grid);
        int maxMajorDiagProd = checkMajorDiagonals(grid);
        int maxMinorDiagProd = checkMinorDiagonals(grid);

        System.out.println("Maximum row product: " + maxRowProd);
        System.out.println("Maximum column product: " + maxColumnProd);
        System.out.println("Maximum major diagonal product: " + maxMajorDiagProd);
        System.out.println("Maximum minor diagonal product: " + maxMinorDiagProd);
        
        }
}
