from django.db import models
from django.contrib.auth import get_user_model

user = get_user_model()

class Task(models.Model):
    title = models.CharField(max_length=200)
    content = models.TextField(null=True)
    date = models.DateTimeField
