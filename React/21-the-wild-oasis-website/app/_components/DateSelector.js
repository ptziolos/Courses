"use client";

import { differenceInDays, isSameDay, isWithinInterval } from "date-fns";
import { DayPicker } from "react-day-picker";
import "react-day-picker/dist/style.css";
import { useReservation } from "./ReservationContext";

function isAlreadyBooked(range, datesArr) {
  return (
    range?.from &&
    range?.to &&
    datesArr.some((date) =>
      isWithinInterval(date, { start: range.from, end: range.to })
    )
  );
}

function DateSelector({ settings, cabin, bookedDates }) {
  const { range, setRange, resetRange } = useReservation();

  const displayRange = isAlreadyBooked(range, bookedDates) ? {} : range;

  const { regularPrice, discount } = cabin;
  const numNights = differenceInDays(range?.to, range?.from);
  const cabinPrice = numNights * (regularPrice - discount);

  // SETTINGS
  const { minBookingLength, maxBookingLength } = settings;

  // v9: navigation & visibility bounds
  const today = new Date();
  const startMonth = new Date(today.getFullYear(), today.getMonth(), 1);
  const endMonth = new Date(today.getFullYear() + 5, 11, 1);

  return (
    <div className="flex flex-col justify-between">
      <DayPicker
        className="pt-6 place-self-center no-wrap"
        mode="range"
        selected={displayRange}
        onSelect={setRange}
        min={minBookingLength + 1}
        max={maxBookingLength}
        startMonth={startMonth}
        startDate={new Date()}
        endMonth={endMonth}
        hidden={[{ before: today }]}
        captionLayout="dropdown"
        numberOfMonths={1}
        pagedNavigation
        animate
        // disabled={(curDate) => isPast(curDate) || bookedDates}
        disabled={(curDate) =>
          bookedDates.some((date) => isSameDay(date, curDate))
        }
      />

      <div className="flex items-center justify-between px-8 bg-accent-500 text-primary-800 h-[72px]">
        <div className="flex items-baseline gap-6">
          <p className="flex gap-2 items-baseline">
            {discount > 0 ? (
              <>
                <span className="text-2xl">${regularPrice - discount}</span>
                <span className="line-through font-semibold text-primary-700">
                  ${regularPrice}
                </span>
              </>
            ) : (
              <span className="text-2xl">${regularPrice}</span>
            )}
            <span className="">/night</span>
          </p>
          {numNights ? (
            <>
              <p className="bg-accent-600 px-3 py-2 text-2xl">
                <span>&times;</span> <span>{numNights}</span>
              </p>
              <p>
                <span className="text-lg font-bold uppercase">Total</span>{" "}
                <span className="text-2xl font-semibold">${cabinPrice}</span>
              </p>
            </>
          ) : null}
        </div>

        {range?.from || range?.to ? (
          <button
            className="border border-primary-800 py-2 px-4 text-sm font-semibold"
            onClick={resetRange}
          >
            Clear
          </button>
        ) : null}
      </div>
    </div>
  );
}

export default DateSelector;
