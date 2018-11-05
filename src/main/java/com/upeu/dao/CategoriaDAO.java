/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upeu.dao;

import com.upeu.modell.Categoria;
import java.util.List;

/**
 *
 * @author P&D
 */
public interface CategoriaDAO {
    public List<Categoria> readCat();
    public void createCat(Categoria cat);
    public void updateCat(Categoria cat);
    public void deleteCat(Categoria cat);
}
