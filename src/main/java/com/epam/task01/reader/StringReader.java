package com.epam.task01.reader;

import com.epam.task01.exception.CustomArrayException;

import java.io.File;

public interface StringReader<T> {
    String read(T t) throws CustomArrayException;
}
