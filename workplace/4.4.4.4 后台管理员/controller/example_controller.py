from flask import Blueprint, request

example = Blueprint('example', __name__, url_prefix='/example')

@example.route('get_user')
def get_user():

    return {
        'success': True,
        'message': '',
        'data': {
            'name': 'xiaow',
            'age': 20,
            'sex': '男',
            'identify': 'student'
        }
    }