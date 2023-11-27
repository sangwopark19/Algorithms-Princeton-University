public class Percolation {
    int[][] id;

    // 테스트 클라이언트(선택 사항)
    public static void main(String[] args) {
        Percolation percolation = new Percolation(10);
        System.out.println(percolation.id.length);
    }

    // 모든 사이트가 처음에 차단된 상태에서 n 단위 그리드를 생성합니다.
    public Percolation(int n) {
        constCheck(n);
        id = new int[n][n];
        for (int i = 0; i < id.length; i++) {
            for (int j = 0; j < id.length; j++) {
                id[i][j] = (i * id.length) + j;
            }
        }
    }

    // 사이트(행, 열)가 아직 열려 있지 않은 경우 사이트를 엽니다.
    public void open(int row, int col) {
        int site = siteCheck(row, col);

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

    private int siteCheck(int row, int col) {
        if (row > id.length || col > id.length) {
            throw new IllegalArgumentException("유효한 범위를 입력해주세요.");
        }
        return ((row - 1) * id.length) + (col - 1);
    }

    private void constCheck(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("0 이하는 불가능 합니다.");
        }
    }

}
