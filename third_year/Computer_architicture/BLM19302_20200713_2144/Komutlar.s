	AREA myData, DATA, READWRITE; Define a data section  Target-options menuden aral1klar verilmeli 
Array DCD 0, 0, 0,0, 0 ; Define an array with five integers	
	
	AREA islem,CODE,READONLY
num equ 1000	
	ENTRY

	
	ldr r0,=num
	mov r1, #num
	MOV R7,#0x20000000	
	LDR R2,=dizi; adres
	LDR R3,dizi; adresteki veri 
	LDR R4,[R2]
	LDR R8,[R2,#4]! ; Önce index artiriliyor sonra data yukleniyor
	LDR R9,[R2],#4; Önce yükleyip sonra artiriyor
	mov R10,#1
	LDR R11,[R2,R10,LSL #2] ; R10 2 defa shift, 4 ile carpim
	LDR R6,=Array
	
	LDR R5,[R6]
	STR R0,[R7]
	STR R0,[R6]
	ADD R7,R7,#4
	STR R3,[R7]
	ADD R7,R7,#4
	
dizi	DCD 10,20,30,40	

	
	
	
	END