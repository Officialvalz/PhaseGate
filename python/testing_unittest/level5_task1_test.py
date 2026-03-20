import unittest
from level5_task1 import sorted_primes

class TestLevel5Task1(unittest.TestCase):

    def test_with_mixed_primes_and_non_primes(self):
        given_numbers = [5, 9, 3, 6, 2]
        when_result = sorted_primes(given_numbers)
        then_expected = [2, 3, 5]
        self.assertEqual(then_expected, when_result)

    def test_with_no_primes_in_array(self):
        given_numbers = [4, 6, 8, 9]
        when_result = sorted_primes(given_numbers)
        then_expected = []
        self.assertEqual(then_expected, when_result)

    def test_with_all_primes_in_array(self):
        given_numbers = [7, 11, 2, 5]
        when_result = sorted_primes(given_numbers)
        then_expected = [2, 5, 7, 11]
        self.assertEqual(then_expected, when_result)

    def test_with_one_and_zero_included(self):
        given_numbers = [0, 1, 3, 5]
        when_result = sorted_primes(given_numbers)
        then_expected = [3, 5]
        self.assertEqual(then_expected, when_result)

    def test_with_negative_numbers(self):
        given_numbers = [-3, -7, 2, 5]
        when_result = sorted_primes(given_numbers)
        then_expected = [2, 5]
        self.assertEqual(then_expected, when_result)
