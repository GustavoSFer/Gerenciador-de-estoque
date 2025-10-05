package com.github.gustavosfer.mapper;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

public class ObjectMapper {

    private static Mapper mapper = DozerBeanMapperBuilder.buildDefault();

    public static <O, D>  D parteObject(O origen, Class<D> destination) {
    return mapper.map(origen, destination);
    }
}
