from flask import Blueprint, request

example = Blueprint('example', __name__, url_prefix='/example')

@example.route('/get_user')
def get_user():
    return {
        'success': True,
        'message': '',
        'data': {
            'name': 'xiaow',
            'age': 20,
            'sex': 1,
            'identify': 'student'
        }
    }

@example.route('set_user', methods=['POST'])
def set_user():
    print(request.form)
    print(request.get_json())
    print(request.args)
    print(type(request.get_json()))
    return {
        'success': True,
        'message': '',
        'data': {}
    }