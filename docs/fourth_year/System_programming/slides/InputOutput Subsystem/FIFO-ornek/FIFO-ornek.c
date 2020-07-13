#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/stat.h>


void main(){
	int f;
	FILE *a, *b;
	char r[7];
	mkfifo("myFifo", 0777);
	if( (f=fork()) < 0) printf("Can't fork.\n");
	else if(f > 0){
		a = fopen("myFifo", "w"); //Write
		fputs("HELLO\0", a);
		fclose(a);
	}else{
		b = fopen("myFifo", "r"); //Read
		fgets(r, 7, b);
		fclose(b);
		printf("Read: %s\n",r);		
	}
	unlink("myFifo");
}
