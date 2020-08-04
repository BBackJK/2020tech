from django.shortcuts import render
from django.views.generic.edit import CreateView, UpdateView, DeleteView
from django.shortcuts import redirect

# Create your views here.

from .models import Photo

def photo_list(request):
    post_list = Photo.objects.all()

    return render(request, 'photo/list.html', {
        'post_list' : post_list
    })

class PhotoUploadView(CreateView):
    model = Photo
    fields = ['photo', 'text']
    template_name = 'photo/upload.html'

    def form_valid(self, form):
        form.instance.author_id = self.request.user.id
        if form.is_valid():
            form.instance.save()
            return redirect('/')

        else:
            return self.render_to_response({'form': form})

class PhotoUpdateView(UpdateView):
    model = Photo
    fields = ['photo', 'text']
    template_name = 'photo/update.html'

class PhotoDeleteView(DeleteView):
    model = Photo
    template_name = 'photo/delete.html'
    success_url = '/'       # 삭제 후 '/'로 이동