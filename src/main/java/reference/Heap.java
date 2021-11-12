package reference;

class Heap {
    int id = 0;
    public static void main(String [] args) {
        int x = 0;
        Heap [ ] hq = new Heap[5];
        while ( x < 3 ) {
            hq[x] = new Heap();
            hq[x].id = x;
            x = x + 1;
        }
        hq[3] = hq[1];
        hq[4] = hq[1];
        hq[3] = null;


        hq[4] = hq[0];

        hq[0] = hq[3];


        hq[3] = hq[2];


        hq[2] = hq[0];


        System.out.println("h[3]  has  id=2 and h[4]  has  id = 0   h[1] has id = 1");

    }
}