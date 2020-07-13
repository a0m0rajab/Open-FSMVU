segment .text
global my_func

my_func:
    push ebp
    mov  ebp,esp
    sub  esp,4          ; temp will be here

    mov  eax,[ebp+8] 
    add  eax, [ebp+12]   
    mov  [ebp-4],eax    ; sum in tmp

    mov  eax,[ebp+8]
    cmp  eax, [ebp +12]
    jg   label1
     mov  eax,[ebp+12]
     sub eax, [ebp+8]
     jmp label2
label1 sub  eax, [ebp +12]

label2 mul dword [ebp-4]


ending:
    mov  esp,ebp
    pop  ebp
    ret
