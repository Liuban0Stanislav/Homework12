public class Main {
    public static void main(String[] args) {
        Author kirBulichev = new Author("Кир", "Булычев");
        Author nikolayNosov = new Author("Николай", "Носов");

        Book tayna3Planety = new Book("Тайна третьей планеты", kirBulichev, 2013);
        Book nethnaykaNaLune = new Book("Незнайка на луне", nikolayNosov, 1956);

        System.out.println(tayna3Planety.equals(nethnaykaNaLune));
    }
}