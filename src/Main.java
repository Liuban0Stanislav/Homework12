public class Main {
    public static void main(String[] args) {
        Author kirBulichev = new Author("Кир", "Булычев");
        Author nikolayNosov = new Author("Николай", "Носов");

        Book tayna3Planety = new Book("Тайна третьей планеты", kirBulichev, 2013);
        Book nethnaykaNaLune = new Book("Незнайка на луне", nikolayNosov, 1965);

        System.out.println("Название книги = " + tayna3Planety.getName());
        System.out.println("Автор = " + tayna3Planety.getAuthor().getFirstName() + " " + tayna3Planety.getAuthor().getLastName());
        System.out.println("Год издания = " + tayna3Planety.getPublishYear());
        System.out.println();

        nethnaykaNaLune.setPublishYear(1996);
        System.out.println("Год издания измененный = " + nethnaykaNaLune.getPublishYear());
        System.out.println();

        System.out.println(kirBulichev.toString());
        System.out.println(kirBulichev.equals(nikolayNosov));
        System.out.println(kirBulichev.hashCode());
        System.out.println();

        System.out.println(tayna3Planety.toString());
        Book newBook = nethnaykaNaLune;
        System.out.println(nethnaykaNaLune.equals(newBook));
        System.out.println(nethnaykaNaLune.hashCode());
    }
}