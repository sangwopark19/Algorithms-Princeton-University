public class Percolation {
    int[] id;
    int size;

    // 모든 사이트가 처음에 차단된 상태에서 n 단위 그리드를 생성합니다.
    public Percolation(int n) {
        size = n * n;
        id = new int[size];
        for (int i = 1; i <= size; i++) {
            id[i] = i;
        }
    }

    // 사이트(행, 열)가 아직 열려 있지 않은 경우 사이트를 엽니다.
    public void open(int row, int col) {

    }

    // 사이트(행, 열)가 열려 있나요?
    public boolean isOpen(int row, int col) {

    }

    // 사이트(행, 열)가 꽉 찼나요?
    public boolean isFull(int row, int col) {

    }

    // 열려 있는 사이트 수를 반환합니다.
    public int numberOfOpenSites() {

    }

    // 시스템이 침투합니까?
    public boolean percolates() {

    }

    // 테스트 클라이언트(선택 사항)
    public static void main(String[] args) {

    }
}
