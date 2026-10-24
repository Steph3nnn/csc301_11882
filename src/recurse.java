public void show(int a){
    if (a == 5){
        return;
    }
    System.out.println(a);
    show(a + 1);


}
public void add(int a){

}
void main() {
    show(0);
}
