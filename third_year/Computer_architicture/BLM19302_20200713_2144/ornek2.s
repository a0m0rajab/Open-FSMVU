	AREA ornek,CODE,READONLY
boyut EQU 3	
	ENTRY
	
	;Bir dizi i�erisinde 5�ten b�y�k 20�den k���k say�lar�n adedini bulan ARM assembly program�n� yaz�n�z.

	;Dizinin baslangic R6
	LDR r6,=dizi
	;Dizinin boyutu R7
	LDR r7,=boyut
	;sayi adedi R0
	mov R0,#0
	MOV r1,#0; dizinin indisi
	
bas	LDR R4,[R6,R1]
	ADD R1,R1,#4
	CMP R4,#5
	BLT dongu	; eger 5 ten kucukse islem yapma
	CMP R4,#20
	BHI dongu		; eger 20 den buyukse islem yapma
	ADD R0,R0,#1
	
;dizinin sinir kontrol�
dongu	sub r7,r7,#1	
	cmp r7,#0
	BNE bas
son b son
	
dizi DCD 5,7,1,2,15,10	
	END