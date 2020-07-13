	;f=g-A[B[4]]
	AREA veriler,DATA,READWRITE
Array	DCD 0,0,0,0,0	
	
	AREA ornek,CODE,READONLY

	ENTRY
	
	LDR R6,=Adizi ; A dizisinin baslangic adresi
	LDR R7,=Bdizi ; B dizisini baslangic adresi
	MOV R1,#25	  ; g degeri 25 olarak atand1	
	MOV R2,#4
	LDR R3,[R7,#16] ; R3 icerisine B[4] aktarildi (su an 1 var)
	
	MUL R5,R3,R2	; A dizisinin B[4] elemani kaç ileride- Tam sayi tuttugumuz icin 4 ile carptik.
	LDR R8,[R6,R5]  ; A dizisinin B[4].(Bizim ornekte 1 sayisi oluyor) elemani aktarildi 
	;ADD R0,R1,R2
	SUB R0,R1,R8	;R0 içerisine g-A[B[4]] aktarildi
Adizi	DCD 10,20,30,40,50	
Bdizi	DCD 1,2,3,2,1
	END