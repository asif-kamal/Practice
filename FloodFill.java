import java.util.Arrays;

class FloodFill {
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) {
            return image;
        }
        fill(image, sr, sc, image[sr][sc], color);
        for (int[] row : image) {
            System.out.println(Arrays.toString(row));
        }
        return image;
    }

    public static void fill(int[][] image, int sr, int sc, int originalColor, int color) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != originalColor) {
            return;
        }
        image[sr][sc] = color;
        fill(image, sr+1, sc, originalColor, color);
        fill(image, sr-1, sc, originalColor, color);
        fill(image, sr, sc+1, originalColor, color);
        fill(image, sr, sc-1, originalColor, color);
    }

    public static void main(String[] args) {
        int[][] imageMatrix = new int[][]{{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1;
        int sc = 1;
        int color = 2;

        floodFill(imageMatrix, sr, sc, color);

    }
}