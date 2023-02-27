public class Main {
    public static void main(String[] args) {
        Author kirBulichev = new Author("Кир Булычев");
        Author nikolayNosov = new Author("Николай Носов");

        Book tayna3Planety = new Book("Тайна третьей планеты", kirBulichev, 2013);
        Book nethnaykaNaLune = new Book("Незнайка на луне", nikolayNosov, 1965);

        System.out.println("Название книги = " + tayna3Planety.getName());
        System.out.println("Автор = " + tayna3Planety.getAuthor().getName());
        System.out.println("Год издания = " + tayna3Planety.getPublishYear());
        System.out.println();

        nethnaykaNaLune.setPublishYear(1996);
        System.out.println("Год издания измененный = " + nethnaykaNaLune.getPublishYear());
    }
}