package com.epam.task01.reader;

import com.epam.task01.entity.CustomArray;
import com.epam.task01.exception.CustomArrayException;

import java.io.File;
import java.io.IOException;
import java.util.Optional;

public interface Read<T> {
    Optional<CustomArray> read(T t) throws IOException, CustomArrayException;
}
