package com.epam.task01.reader;

import com.epam.task01.exception.CustomArrayException;

import java.io.File;

public interface Reader<T> {
    String read(File file) throws CustomArrayException;
}
