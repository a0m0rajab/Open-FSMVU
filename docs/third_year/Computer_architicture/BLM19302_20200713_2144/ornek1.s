	AREA ornek,CODE,READONLY
boyut EQU 3	
	ENTRY
	;Dizi içerisindeki en büyük elemanı bulan ARM assembly programını yazınız.
	;Dizinin baslangic R6
	LDR r6,=dizi
	;Dizinin boyutu R7
	LDR r7,=boyut
	;en buyuk R3
	LDR r3,[r6]  ; dizinin ilk elemani en buyuk
	MOV r1,#0; dizinin indisi
	
bas	ADD r1,R1,#4
	LDR r4,[r6,r1]; Bir sonraki elemani r4
	cmp r3,r4
	BGT islem
	MOV r3,r4

islem	sub r7,r7,#1
	cmp r7,#0
	BNE bas
	
	
dizi DCD 5,7,1,2,15,10	
	END