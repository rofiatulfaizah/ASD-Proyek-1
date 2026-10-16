/**
 * testDoublyLinkedList
 */
public class testDoublyLinkedList {

    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();
      linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.addFirst(4);
        linkedList.addFirst(5);
        linkedList.addFirst(6);
        System.out.println(linkedList.get(2)); // menghasilkan nilai 3
        // System.out.println(linkedList.get(12)); //Terjadi exception error
        try {
            System.out.println(linkedList.get(12));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index tidak valid!");
        }
        System.out.println(linkedList.indexOf(4));// menghasilkan 5
        System.out.println(linkedList.indexOf(10));// menghasilkan -1
        linkedList.printReverse(); // Menghasilkan 6,5,4,3,2,1
        System.out.println(linkedList.remove(3)); // Menghasilkan True
        System.out.println(linkedList.remove(8)); // Menghasilkan False
        System.out.println(linkedList.toArray()); //Menghasilkan [6,5,4,3,2,1]
    }
}

// Penjelasan:
// Penggunaan addFirst() menyebabkan setiap data baru dimasukkan ke
// bagian awal linked list, sehingga urutan data menjadi
// [6, 5, 4, 3, 2, 1].
//
// Oleh karena itu, get(2) menghasilkan nilai 4 dan indexOf(4)
// menghasilkan indeks 2.
//
// Metode printReverse() mencetak data dari tail menuju head,
// sehingga urutan output menjadi 1, 2, 3, 4, 5, 6.
//
// Setelah remove(3) berhasil dijalankan, data 3 dihapus dari list.
// Sementara itu, remove(8) menghasilkan false karena data 8 tidak
// ditemukan.
//
// Akibatnya, isi array setelah kedua operasi penghapusan tersebut
// menjadi [6, 5, 4, 2, 1].
//
// Perbedaan output terjadi karena urutan pembentukan list menggunakan
// addFirst() dan perubahan data setelah operasi penghapusan.