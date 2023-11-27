import edu.princeton.cs.algs4.QuickFindUF;

public class Percolation {
    private QuickFindUF quickFindUF;
    private int gridLength;
    private boolean[] isOpen;

    // 테스트 클라이언트(선택 사항)
    public static void main(String[] args) {
        Percolation percolation = new Percolation(5);
    }

    // 모든 사이트가 처음에 차단된 상태에서 n 단위 그리드를 생성합니다.
    public Percolation(int n) {
        gridLength = n;
        quickFindUF = new QuickFindUF(gridLength * gridLength);
        isOpen = new boolean[gridLength * gridLength];
    }

    // 사이트(행, 열)가 아직 열려 있지 않은 경우 사이트를 엽니다.
    public void open(int row, int col) {
        int site = calculateSite(row, col);
        isOpen[site] = true;
    }

    private int calculateSite(int row, int col) {
        return ((row - 1) * gridLength) + (col - 1);
    }

    // 사이트(행, 열)가 열려 있나요?
    public boolean isOpen(int row, int col) {
        return true;
    }

    // 사이트(행, 열)가 꽉 찼나요?
    public boolean isFull(int row, int col) {
        return true;
    }

    // 열려 있는 사이트 수를 반환합니다.
    public int numberOfOpenSites() {
        return 0;
    }

    // 시스템이 침투합니까?
    public boolean percolates() {
        return true;
    }

}
