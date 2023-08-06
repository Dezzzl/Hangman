public class Gallows {
    public String getGallow(int stage){
        String[] gallows=new String[]{
                        "\n                _____" +
                        "\n               |     |" +
                        "\n                     |" +
                        "\n                     |" +
                        "\n                     |" +
                        "\n                 _______\n",
                        "\n                _____" +
                        "\n               |     |" +
                        "\n               o     |" +
                        "\n                     |" +
                        "\n                     |" +
                        "\n                 _______\n",
                        "\n                _____" +
                        "\n               |     |" +
                        "\n               o     |" +
                        "\n               |     |" +
                        "\n                     |" +
                        "\n                 _______\n",
                        "\n                _____" +
                        "\n               |     |" +
                        "\n               o     |" +
                        "\n               |     |" +
                        "\n              /      |" +
                        "\n                 _______\n",
                        "\n                _____" +
                        "\n               |     |" +
                        "\n               o     |" +
                        "\n               |     |" +
                        "\n              / \\    |" +
                        "\n                 _______\n",
                        "\n                _____" +
                        "\n               |     |" +
                        "\n               o     |" +
                        "\n              /|     |" +
                        "\n              / \\    |" +
                        "\n                 _______\n",
                        "\n                _____" +
                        "\n               |     |" +
                        "\n               o     |" +
                        "\n              /|\\    |" +
                        "\n              / \\    |" +
                        "\n                 _______\n"
        };
        return gallows[stage];
    }
}
