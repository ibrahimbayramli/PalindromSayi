# 3. Kodlama Odevi

* Bir java methodu gelistireceksiniz, girdisi bir tane String olan, ciktisi da bir tane String olan.
* Methodunuzun imzasi su sekilde olacak => String palindromeTamamlayiciSayi(String sayi)
* Tam sayi ise de, bu sayi ile toplandiginda olusan sonucun palindrom oldugu bir sayi bulacak ve bu sayiyi String tipinde donecek.

__Ornek #1:__ Girdi olarak iletilen String => "araba". Istisna firlatmali.<br>
__Ornek #2:__ Girdi olarak iletilen String => "123" Beklenen Cikti= "8" (123+8 sonucunda olusan 131 palindromdur.)<br>

## Dikkat edilmesi gereken noktalar/tuyolar:

* Tek dogru cevap yok, herhangi bir dogru cevabi vermeniz yeterli. Ornek #2'de "8" dogru cevap ama "18" de dogru bir cevap cunku 123+18 = 141 ve 141 sayisi da bir palindrom.
* Girdinin ve ciktinin tipinin tam sayi (integer) yerine String olmasinin bir esprisi var :)