import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    //ДІЯ 2: Пишемо реалізацію конструктора для класу Main, в якому описуємо графічний інтерфейс користувача та обробники подій
    public Main() {

        //Створюємо і налаштувємо вікно програми (JFrame)
        JFrame MainForm = new JFrame("Обмін валют"); // Створюємо новий екземпляр класу з ідентифікатором MainForm і заголовком "Обмін валют"
        MainForm.setSize(300, 220); // Визначаємо розміри вікна (форми) в пікселях
        MainForm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //визначаємо дію, що буде виконуватися при кліканні на системній кнопці "Х" (верхній правий кут вікна)
                                                                                //можливі чотири константи: DO_NOTHING_ON_CLOSE - нічого не робити;
                                                                                // HIDE_ON_CLOSE - скрити вікно;
                                                                                // DISPOSE_ON_CLOSE - закрити тільки вікно (додаток продовжує працювати)
                                                                                // EXIT_ON_CLOSE - закрити вікно разом із додатком
        MainForm.setResizable(false); // Визначаємо, що для форми не можлива зміна розмірів
        MainForm.setLocationRelativeTo(null); // Визначаємо розташування форми при запуску. В цьому випадку вона буде з'являтися по центру вікна
        MainForm.setLayout(null); // Дозволяє надалі задавати положення і розміри форми напряму через вказування координат в пікселях
        MainForm.setVisible(true); // В цей момент форма з'являється на екрані (поки що пуста)

        JTextField DollarsRate = new JTextField(); // Створюємо компонент для зображення і редагування текстового рядка (екземпляр класу JTextField), в якому буде вноситися курс долара
        DollarsRate.setBounds(10,10,150,30); // Визначаємо його положення на формі і розміри (координата 0,0 у верхньому лівому куті форми)
        MainForm.add(DollarsRate); // Додаємо налаштований екземпляр на форму (при цьому він з'явиться на формі)

        JTextField DollarsSum = new JTextField(); // По аналогії з блоком вище, створюємо ще один компонент JTextField), в якому буде вноситися сумма в доларах
        DollarsSum.setBounds(10,50,270,30);
        MainForm.add(DollarsSum);

        JButton Calculate = new JButton("Перевести"); // Створюємо кнопку (екземпляр класу JButton)
        Calculate.setBounds(10,90, 150,30); // Визначаємо його положення на формі і розміри
        MainForm.add(Calculate); // Додаємо налаштований екземпляр на форму


        JTextField HryvnaSum = new JTextField(); // Створюємо компонент для зображення текстового рядка (екземпляр класу JTextField), в якому буде відображатися перерахована сума в гривнах
        HryvnaSum.setBounds(10,130,270,30); // Визначаємо його положення на формі та розміри
        HryvnaSum.setEditable(false); // Забороняємо редагування тексту в цьому компоненті
        MainForm.add(HryvnaSum); // Додаємо налаштований екземпляр на форму

        //Lambda-вираз для визначення обробника події ActionListener з ідентифікатором CalculateClick (завданий для зручності ідентифікації для якого компонента далі буде застосований)
        ActionListener CalculateClick = (ActionEvent e) ->{
           HryvnaSum.setText(String.valueOf(Double.parseDouble(DollarsSum.getText()) * Double.parseDouble(DollarsRate.getText()))); //парсинг текстових даних в числові значення перемноження суми на курс і зворотнє перетворення у string
        };

        Calculate.addActionListener(CalculateClick); // Обробник події зв'язуємо з компонентом (кнопкою Calculate).
                                                     // ВАЖЛИВО!!! Ця дія завжди повинна писатися після створення самого обробника!

    }
    // ДІЯ 1: Створюємо головну функцію main() в якій активуємо Swing-виклик і перевизначаємо (@Override) метод run()
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main(); // В методі run() створюэться конструктор для класу Main, в якому буде опис інтерфейсу та обробників подій
            }
        });
    }
}
