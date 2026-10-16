/**
 * testSinglyLinkedList
 */
public class testSinglyLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.addFirst(4);
        linkedList.addFirst(5);
        linkedList.addFirst(6);
        // isi list sekarang (head -> tail): 6,5,4,3,2,1

        System.out.println(linkedList.get(2)); // menghasilkan nilai 4
        try {
            System.out.println(linkedList.get(12));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Terjadi exception: " + e.getMessage()); // index 12 di luar jangkauan
        }
        System.out.println(linkedList.indexOf(4)); // menghasilkan 2
        System.out.println(linkedList.indexOf(10)); // menghasilkan -1
        linkedList.printReverse(); // menghasilkan 1,2,3,4,5,6 (masing-masing satu baris)
        System.out.println(linkedList.remove(3)); // menghasilkan true
        System.out.println(linkedList.remove(8)); // menghasilkan false
        System.out.println(linkedList.toArray()); // menghasilkan [6, 5, 4, 2, 1]
    }
}

/*
Perubahan dari kode test sebelumnya:
 
1. Ditambahkan komentar "isi list sekarang (head -> tail): 6,5,4,3,2,1"
   karena addFirst() menambah elemen baru di depan (head), sehingga urutan
   list kebalikan dari urutan pemanggilan addFirst.
 
2. get(2): komentar hasil diperbaiki dari 3 menjadi 4
   (index 2 dari head pada list 6,5,4,3,2,1 adalah 4).
 
3. get(12): dilakukan try-catch (IndexOutOfBoundsException) agar program
   tidak berhenti dan baris-baris setelahnya tetap dijalankan.
 
4. indexOf(4): komentar hasil diperbaiki dari 5 menjadi 2
   (angka 4 berada di index 2 dari head).
 
5. printReverse(): komentar hasil diperbaiki dari 6,5,4,3,2,1 menjadi
   1,2,3,4,5,6, karena dicetak dari tail ke head.

6. toArray(): komentar hasil diperbaiki dari [6,5,4,3,2,1] menjadi
   [6, 5, 4, 2, 1], karena angka 3 sudah dihapus oleh remove(3).
   Kemudian karena println(array) mencetak alamat objek bukan isinya jadi 
   hasil yang keluar adalah alamat [Ljava.lang.Object;@14dad5dc 
*/
