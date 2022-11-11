#!/usr/bin/env python
# -*- coding: utf-8 -*-

def remover_espacio(cadena):
    return cadena.replace(' ','')

s = "   Python rocks!"

print (s)
print (remover_espacio(s))