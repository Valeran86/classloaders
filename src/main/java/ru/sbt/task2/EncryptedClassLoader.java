package ru.sbt.task2;

import java.io.File;

/**
 * Данный класслоадер умеет загружать классы из файлов дешифрую их. Ваша задача переопределить метод findClass().
 * В нем лоадер считывает зашифрованный массив байт, дешифрует его и превращает в класс (с помощью метода defineClass).
 * <p>
 * На вход класслодер принимает ключ шифрования, рутовую папку, в которой будет искать классы, родительский класслодер.
 * Логика шифрования/дешифрования с использованием ключа может быть любой на ваш вкус
 * (например, каждый считаный байт класса увеличить на определение число).
 */
public class EncryptedClassLoader extends ClassLoader {
    private final String key;
    private final File dir;

    public EncryptedClassLoader( String key, File dir, ClassLoader parent ) {
        super( parent );
        this.key = key;
        this.dir = dir;
    }
}

