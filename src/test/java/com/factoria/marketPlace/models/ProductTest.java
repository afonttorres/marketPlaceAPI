package com.factoria.marketPlace.models;

import org.junit.jupiter.api.Test;


import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void shouldHaveACommentsCounter(){
        //GIVEN
        var product = new Product();
        var comment = new Comment();
        product.addComment(comment);
        //SYSTEM UNDER TEST
        var sut = product.commentsCount();
        //THEN
        assertThat(sut, equalTo(1));
        //WHEN
    }
}