/*
 * Funkcja solve przemierza rekursywnie drzewo. Funkcja wie czy jest to gałąź prawa
 * czy też gałąź lewa rodzica, na tej podstawie liczy głębokość w linii prostej
 * na której się aktualnie znajduje. Wartoś Direction.NONE została dodana żeby
 * funkcja była czytelniejsza, mogłoby jej nie być. Jako że przechodzimy rekursywnie
 * po każdym węźle drzewa, złożoność obliczeniowa wynosi O(n). Złożoność pamięciowa
 * również wynosi O(n).
 */
public class Solution {
    private enum Direction{
        LEFT, RIGHT, NONE
    }
    public int solution(Tree t){
        if (t == null) return -1;
        maxDepth = 0;
        solve(0, Direction.NONE, t);
        return maxDepth;
    }
    
    private static void solve(int depth, Direction d, Tree t){
        if (depth > maxDepth) maxDepth = depth;
        if (t.l != null) {
            switch (d) {
                case NONE:
                case RIGHT:
                    solve(1, Direction.LEFT, t.l);
                    break;
                case LEFT:
                    solve(depth + 1, Direction.LEFT, t.l);
                    break;   
            }
        }
        if (t.r != null) {
            switch (d) {
                case NONE:
                case LEFT:
                    solve(1, Direction.RIGHT, t.r);
                    break;
                case RIGHT:
                    solve(depth + 1, Direction.RIGHT, t.r);
                    break;
                
            }
        }
    }
    
    private static int maxDepth;
}
