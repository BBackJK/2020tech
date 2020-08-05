from django.contrib import admin

from .models import *

class CategoryAdmin(admin.ModelAdmin):
    list_display = ['name', 'slug']
    prepopulated_fields = {'slug': ('name',)}   # slug 필드의 name이 자동으로 설정되도록..?

admin.site.register(Category, CategoryAdmin)

class ProductAdmin(admin.ModelAdmin):
    list_display = ['name', 'slug', 'category',
                    'price', 'stock', 'available_display',
                    'available_order', 'created', 'updated']

    list_filter = ['available_display', 'created', 'updated', 'category']
    prepopulated_fields = {'slug': ('name',)}

    list_editable = ['price', 'stock', 'available_display', 'available_order']

admin.site.register(Product, ProductAdmin)